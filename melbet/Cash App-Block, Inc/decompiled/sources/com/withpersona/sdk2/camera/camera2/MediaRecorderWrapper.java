package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticApiModelOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.AudioConfiguration;
import com.withpersona.sdk2.camera.AudioUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import java.io.File;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class MediaRecorderWrapper {
    public final Surface _surface;
    public final CameraChoice cameraChoice;
    public final Context context;
    public File currentFile;
    public final int fps;
    public final boolean isAudioRequired;
    public boolean isDestroyed;
    public boolean isPrepared;
    public MediaRecorder mediaRecorder;
    public final MutexImpl mutex;
    public final int orientationHint;

    public MediaRecorderWrapper(Context context, CameraChoice cameraChoice, int i, int i2, boolean z) {
        context.getClass();
        cameraChoice.getClass();
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i;
        this.orientationHint = i2;
        this.isAudioRequired = z;
        this._surface = MediaCodec.createPersistentInputSurface();
        this.currentFile = newFile();
        this.mediaRecorder = Build.VERSION.SDK_INT >= 31 ? TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(context) : new MediaRecorder();
        this.mutex = new MutexImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:11:0x0048, B:13:0x004c, B:17:0x0054), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:11:0x0048, B:13:0x004c, B:17:0x0054), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object destroy(ContinuationImpl continuationImpl) {
        MediaRecorderWrapper$destroy$1 mediaRecorderWrapper$destroy$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof MediaRecorderWrapper$destroy$1) {
                mediaRecorderWrapper$destroy$1 = (MediaRecorderWrapper$destroy$1) continuationImpl;
                int i2 = mediaRecorderWrapper$destroy$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    mediaRecorderWrapper$destroy$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = mediaRecorderWrapper$destroy$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mediaRecorderWrapper$destroy$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.isDestroyed) {
                            return Unit.INSTANCE;
                        }
                        MutexImpl mutexImpl2 = this.mutex;
                        mediaRecorderWrapper$destroy$1.L$0 = mutexImpl2;
                        mediaRecorderWrapper$destroy$1.label = 1;
                        if (mutexImpl2.lock(mediaRecorderWrapper$destroy$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = mediaRecorderWrapper$destroy$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (!this.isDestroyed) {
                        return Unit.INSTANCE;
                    }
                    this.isDestroyed = true;
                    try {
                        getSurface().release();
                    } catch (RuntimeException unused) {
                    }
                    try {
                        this.mediaRecorder.stop();
                    } catch (RuntimeException unused2) {
                    } catch (Throwable th) {
                        this.currentFile.delete();
                        throw th;
                    }
                    this.currentFile.delete();
                    return Unit.INSTANCE;
                }
            }
            if (!this.isDestroyed) {
            }
        } finally {
            mutexImpl.unlock(null);
        }
        mediaRecorderWrapper$destroy$1 = new MediaRecorderWrapper$destroy$1(this, continuationImpl);
        Object obj2 = mediaRecorderWrapper$destroy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaRecorderWrapper$destroy$1.label;
        if (i != 0) {
        }
    }

    public final Surface getSurface() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        surface2.getClass();
        return surface2;
    }

    public final File newFile() {
        return new File(this.context.getCacheDir(), Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis(), "video_recording_", ".mp4"));
    }

    public final void newRecordSession(boolean z) {
        AudioConfiguration audioConfiguration;
        Throwable th;
        if (!z) {
            this.currentFile = newFile();
        }
        boolean z2 = ContextUtilsKt.isMicPresent(this.context) && this.isAudioRequired;
        this.mediaRecorder.setVideoSource(2);
        if (z2) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        MediaRecorder mediaRecorder = this.mediaRecorder;
        Size size = this.cameraChoice.size;
        mediaRecorder.setVideoSize(size.getWidth(), size.getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        MediaRecorder mediaRecorder2 = this.mediaRecorder;
        int height = size.getHeight() * size.getWidth();
        mediaRecorder2.setVideoEncodingBitRate(height <= 172800 ? 400000 : height <= 409920 ? 600000 : height <= 921600 ? 1000000 : height <= 2073600 ? 1500000 : 1800000);
        if (z2) {
            Iterator it = AudioUtilsKt.SAMPLE_RATES.iterator();
            while (true) {
                audioConfiguration = null;
                r2 = null;
                AudioRecord audioRecord = null;
                AudioRecord audioRecord2 = null;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                try {
                    int minBufferSize = AudioRecord.getMinBufferSize(intValue, 16, 2);
                    if (minBufferSize != -2) {
                        AudioRecord audioRecord3 = new AudioRecord(1, intValue, 16, 2, minBufferSize);
                        try {
                            if (audioRecord3.getState() == 1) {
                                audioRecord3.release();
                                audioConfiguration = new AudioConfiguration(intValue, minBufferSize);
                                audioRecord3.release();
                                break;
                            }
                            audioRecord3.release();
                        } catch (IllegalArgumentException unused) {
                            audioRecord = audioRecord3;
                            if (audioRecord != null) {
                                audioRecord.release();
                            }
                        } catch (SecurityException unused2) {
                            audioRecord = audioRecord3;
                            if (audioRecord != null) {
                                audioRecord.release();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            audioRecord2 = audioRecord3;
                            if (audioRecord2 == null) {
                                throw th;
                            }
                            audioRecord2.release();
                            throw th;
                        }
                    }
                } catch (IllegalArgumentException unused3) {
                } catch (SecurityException unused4) {
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (audioConfiguration != null) {
                this.mediaRecorder.setAudioSamplingRate(audioConfiguration.sampleRateInHz);
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        this.mediaRecorder.setInputSurface(getSurface());
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
    }
}
