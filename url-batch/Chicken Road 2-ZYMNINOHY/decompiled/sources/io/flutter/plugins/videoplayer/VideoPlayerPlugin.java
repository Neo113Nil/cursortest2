package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import R1.k;
import android.content.Context;
import android.util.LongSparseArray;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;
import io.flutter.plugins.videoplayer.platformview.PlatformViewVideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;
import io.flutter.view.TextureRegistry;
import java.util.Objects;

/* loaded from: classes.dex */
public class VideoPlayerPlugin implements FlutterPlugin, AndroidVideoPlayerApi {
    private static final String TAG = "VideoPlayerPlugin";
    private FlutterState flutterState;
    private final LongSparseArray<VideoPlayer> videoPlayers = new LongSparseArray<>();
    private final VideoPlayerOptions sharedOptions = new VideoPlayerOptions();
    private long nextPlayerIdentifier = 1;

    /* renamed from: io.flutter.plugins.videoplayer.VideoPlayerPlugin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat;

        static {
            int[] iArr = new int[PlatformVideoFormat.values().length];
            $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat = iArr;
            try {
                iArr[PlatformVideoFormat.SS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[PlatformVideoFormat.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[PlatformVideoFormat.HLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class FlutterState {
        final Context applicationContext;
        final BinaryMessenger binaryMessenger;
        final KeyForAssetFn keyForAsset;
        final KeyForAssetAndPackageName keyForAssetAndPackageName;
        final TextureRegistry textureRegistry;

        public FlutterState(Context context, BinaryMessenger binaryMessenger, KeyForAssetFn keyForAssetFn, KeyForAssetAndPackageName keyForAssetAndPackageName, TextureRegistry textureRegistry) {
            this.applicationContext = context;
            this.binaryMessenger = binaryMessenger;
            this.keyForAsset = keyForAssetFn;
            this.keyForAssetAndPackageName = keyForAssetAndPackageName;
            this.textureRegistry = textureRegistry;
        }

        public void startListening(VideoPlayerPlugin videoPlayerPlugin, BinaryMessenger binaryMessenger) {
            AndroidVideoPlayerApi.Companion.setUp(binaryMessenger, videoPlayerPlugin);
        }

        public void stopListening(BinaryMessenger binaryMessenger) {
            AndroidVideoPlayerApi.Companion.setUp(binaryMessenger, null);
        }
    }

    public interface KeyForAssetAndPackageName {
        String get(String str, String str2);
    }

    public interface KeyForAssetFn {
        String get(String str);
    }

    private void disposeAllPlayers() {
        for (int i4 = 0; i4 < this.videoPlayers.size(); i4++) {
            this.videoPlayers.valueAt(i4).dispose();
        }
        this.videoPlayers.clear();
    }

    private VideoPlayer getPlayer(long j4) {
        VideoPlayer videoPlayer = this.videoPlayers.get(j4);
        if (videoPlayer != null) {
            return videoPlayer;
        }
        String str = "No player found with playerId <" + j4 + ">";
        if (this.videoPlayers.size() == 0) {
            str = AbstractC0005f.z(str, " and no active players created by the plugin.");
        }
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerPlayerInstance$0(BinaryMessenger binaryMessenger, String str) {
        VideoPlayerInstanceApi.Companion.setUp(binaryMessenger, null, str);
    }

    private void registerPlayerInstance(VideoPlayer videoPlayer, long j4) {
        BinaryMessenger binaryMessenger = this.flutterState.binaryMessenger;
        String l4 = Long.toString(j4);
        VideoPlayerInstanceApi.Companion.setUp(binaryMessenger, videoPlayer, l4);
        videoPlayer.setDisposeHandler(new k(binaryMessenger, 5, l4));
        this.videoPlayers.put(j4, videoPlayer);
    }

    private VideoAsset videoAssetWithOptions(CreationOptions creationOptions) {
        String uri = creationOptions.getUri();
        if (uri.startsWith("asset:")) {
            return VideoAsset.fromAssetUrl(uri);
        }
        if (uri.startsWith("rtsp:")) {
            return VideoAsset.fromRtspUrl(uri);
        }
        VideoAsset.StreamingFormat streamingFormat = VideoAsset.StreamingFormat.UNKNOWN;
        PlatformVideoFormat formatHint = creationOptions.getFormatHint();
        if (formatHint != null) {
            int i4 = AnonymousClass1.$SwitchMap$io$flutter$plugins$videoplayer$PlatformVideoFormat[formatHint.ordinal()];
            if (i4 == 1) {
                streamingFormat = VideoAsset.StreamingFormat.SMOOTH;
            } else if (i4 == 2) {
                streamingFormat = VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE;
            } else if (i4 == 3) {
                streamingFormat = VideoAsset.StreamingFormat.HTTP_LIVE;
            }
        }
        return VideoAsset.fromRemoteUrl(uri, streamingFormat, creationOptions.getHttpHeaders(), creationOptions.getUserAgent());
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public long createForPlatformView(CreationOptions creationOptions) {
        VideoAsset videoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j4 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j4;
        String l4 = Long.toString(j4);
        FlutterState flutterState = this.flutterState;
        registerPlayerInstance(PlatformViewVideoPlayer.create(flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(flutterState.binaryMessenger, l4), videoAssetWithOptions, this.sharedOptions), j4);
        return j4;
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public TexturePlayerIds createForTextureView(CreationOptions creationOptions) {
        VideoAsset videoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j4 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j4;
        String l4 = Long.toString(j4);
        TextureRegistry.SurfaceProducer createSurfaceProducer = this.flutterState.textureRegistry.createSurfaceProducer();
        FlutterState flutterState = this.flutterState;
        registerPlayerInstance(TextureVideoPlayer.create(flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(flutterState.binaryMessenger, l4), createSurfaceProducer, videoAssetWithOptions, this.sharedOptions), j4);
        return new TexturePlayerIds(j4, createSurfaceProducer.id());
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void dispose(long j4) {
        getPlayer(j4).dispose();
        this.videoPlayers.remove(j4);
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public String getLookupKeyForAsset(String str, String str2) {
        return str2 == null ? this.flutterState.keyForAsset.get(str) : this.flutterState.keyForAssetAndPackageName.get(str, str2);
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void initialize() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterInjector instance = FlutterInjector.instance();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        FlutterLoader flutterLoader = instance.flutterLoader();
        Objects.requireNonNull(flutterLoader);
        c cVar = new c(flutterLoader);
        FlutterLoader flutterLoader2 = instance.flutterLoader();
        Objects.requireNonNull(flutterLoader2);
        FlutterState flutterState = new FlutterState(applicationContext, binaryMessenger, cVar, new c(flutterLoader2), flutterPluginBinding.getTextureRegistry());
        this.flutterState = flutterState;
        flutterState.startListening(this, flutterPluginBinding.getBinaryMessenger());
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        LongSparseArray<VideoPlayer> longSparseArray = this.videoPlayers;
        Objects.requireNonNull(longSparseArray);
        platformViewRegistry.registerViewFactory("plugins.flutter.dev/video_player_android", new PlatformVideoViewFactory(new c(longSparseArray)));
    }

    public void onDestroy() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.flutterState == null) {
            Log.wtf(TAG, "Detached from the engine before registering to it.");
        }
        this.flutterState.stopListening(flutterPluginBinding.getBinaryMessenger());
        this.flutterState = null;
        onDestroy();
    }

    @Override // io.flutter.plugins.videoplayer.AndroidVideoPlayerApi
    public void setMixWithOthers(boolean z) {
        this.sharedOptions.mixWithOthers = z;
    }
}
