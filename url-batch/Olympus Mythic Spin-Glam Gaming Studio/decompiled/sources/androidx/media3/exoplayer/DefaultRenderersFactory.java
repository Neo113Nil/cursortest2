package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes9.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    protected void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    public final DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z);
        return this;
    }

    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        this.enableAudioTrackPlaybackParams = z;
        return this;
    }

    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (buildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    protected void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList<Renderer> arrayList) {
        Handler handler2;
        Class cls;
        String str;
        int i2;
        int i3;
        arrayList.add(new MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j, z, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                        str = TAG;
                        try {
                            Log.i(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                            try {
                                i3 = i2 + 1;
                                try {
                                    arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                                    Log.i(str, "Loaded Libgav1VideoRenderer.");
                                } catch (ClassNotFoundException unused2) {
                                    i2 = i3;
                                    i3 = i2;
                                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                                    Log.i(str, "Loaded FfmpegVideoRenderer.");
                                }
                            } catch (ClassNotFoundException unused3) {
                            }
                            arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                            Log.i(str, "Loaded FfmpegVideoRenderer.");
                        }
                    } catch (ClassNotFoundException unused4) {
                        str = TAG;
                    }
                } catch (ClassNotFoundException unused5) {
                    str = TAG;
                    i2 = size;
                    i3 = i2 + 1;
                    arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                    Log.i(str, "Loaded Libgav1VideoRenderer.");
                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                    Log.i(str, "Loaded FfmpegVideoRenderer.");
                }
            } catch (ClassNotFoundException unused6) {
                handler2 = handler;
                cls = Handler.class;
            }
            try {
                i3 = i2 + 1;
                arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                Log.i(str, "Loaded Libgav1VideoRenderer.");
                try {
                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                    Log.i(str, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating VP9 extension", e3);
        }
    }

    protected void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i2;
        AudioSink audioSink2;
        Handler handler2;
        String str;
        int i3;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    Log.i(TAG, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        Constructor<?> constructor = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class);
                        audioSink2 = audioSink;
                        handler2 = handler;
                        str = TAG;
                        try {
                            i3 = i2 + 1;
                            try {
                                arrayList.add(i2, (Renderer) constructor.newInstance(handler2, audioRendererEventListener, audioSink2));
                                Log.i(str, "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i2 = i3;
                                i3 = i2;
                                try {
                                    int i4 = i3 + 1;
                                    arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                                    Log.i(str, "Loaded LibflacAudioRenderer.");
                                } catch (ClassNotFoundException unused3) {
                                }
                                arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                                Log.i(str, "Loaded FfmpegAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused4) {
                        }
                    } catch (ClassNotFoundException unused5) {
                        audioSink2 = audioSink;
                        handler2 = handler;
                        str = TAG;
                    }
                    try {
                        int i42 = i3 + 1;
                        try {
                            arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.i(str, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                            i3 = i42;
                            i42 = i3;
                            arrayList.add(i42, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.i(str, "Loaded FfmpegAudioRenderer.");
                        }
                        arrayList.add(i42, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                        Log.i(str, "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating FLAC extension", e);
                    }
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating MIDI extension", e2);
            }
        } catch (ClassNotFoundException unused7) {
        }
        try {
            Constructor<?> constructor2 = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class);
            audioSink2 = audioSink;
            handler2 = handler;
            str = TAG;
            i3 = i2 + 1;
            arrayList.add(i2, (Renderer) constructor2.newInstance(handler2, audioRendererEventListener, audioSink2));
            Log.i(str, "Loaded LibopusAudioRenderer.");
            int i422 = i3 + 1;
            arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
            Log.i(str, "Loaded LibflacAudioRenderer.");
            try {
                arrayList.add(i422, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                Log.i(str, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating Opus extension", e4);
        }
    }

    protected void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    protected void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    protected void buildCameraMotionRenderers(Context context, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    protected void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(ImageDecoder.Factory.DEFAULT, null));
    }

    @Nullable
    protected AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).build();
    }

    protected MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }
}
