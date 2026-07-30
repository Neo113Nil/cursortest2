package p5;

import com.realsil.sdk.core.logger.ZLogger;
import com.realtek.sdk.media.RtkMediaCodecNativeInterface;
import com.realtek.sdk.media.opus.OpusCodec;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.collections.k;
import kotlin.jvm.internal.s;
import o5.b;

/* loaded from: classes4.dex */
public final class b extends o5.b {

    /* renamed from: m, reason: collision with root package name */
    public final OpusCodec f17220m = new OpusCodec();

    /* renamed from: n, reason: collision with root package name */
    public final RtkMediaCodecNativeInterface f17221n = new RtkMediaCodecNativeInterface();

    /* renamed from: o, reason: collision with root package name */
    public final int f17222o = 1;

    @Override // o5.b
    public final void a() {
        this.f17220m.createDecoder(this.f17083i.getSampleRate(), this.f17083i.getChannels());
        this.f17084j = this.f17083i.getSampleRate() / 400;
        ZLogger.v("frameSize=" + this.f17084j);
    }

    @Override // o5.b
    public void cancel() {
        super.cancel();
    }

    @Override // o5.b
    public void release() {
        super.release();
        this.f17220m.destroyDecoder();
    }

    @Override // o5.b
    public void stop() {
        super.stop();
        decode(new byte[]{0});
    }

    @Override // o5.b
    public final boolean a(byte[] data) {
        s.checkNotNullParameter(data, "data");
        super.a(data);
        int length = data.length / (this.f17084j + this.f17222o);
        if (length <= 0) {
            ZLogger.v("no data to decode");
            return false;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i8 + this.f17222o;
            byte[] data2 = k.copyOfRange(data, i10, this.f17084j + i10);
            i8 = i10 + this.f17084j;
            s.checkNotNullParameter(data2, "data");
            byte[] data3 = this.f17220m.decode(data2, 96000, false);
            if (data3 != null && data3.length != 0) {
                s.checkNotNullParameter(data3, "data");
                try {
                    RandomAccessFile randomAccessFile = this.f17079e;
                    if (randomAccessFile != null) {
                        randomAccessFile.write(data3, 0, data3.length);
                    }
                } catch (IOException unused) {
                }
                if (this.f17083i.getDetectionParameters().getEnabled()) {
                    int audioPcmDb = this.f17221n.getAudioPcmDb(data3);
                    if (audioPcmDb >= this.f17083i.getDetectionParameters().getGain()) {
                        setDetectionNumber(getDetectionNumber() + 1);
                        ZLogger.v("detection gain=" + audioPcmDb + ", detectionNumber=" + getDetectionNumber());
                        if (getSpeechDataDetected() && getDetectionNumber() >= this.f17083i.getDetectionParameters().getFrameNumber()) {
                            ZLogger.i("onDetectionCompleted, detectionNumber=" + this.f17085k);
                            b.a aVar = this.f17082h;
                            if (aVar != null) {
                                s.checkNotNull(aVar);
                                aVar.onDetectionCompleted();
                            }
                            setDetectionNumber(0);
                        }
                    } else {
                        ZLogger.v("detection gain=" + audioPcmDb + ", detectionNumber=" + getDetectionNumber());
                        setDetectionNumber(0);
                        setSpeechDataDetected(true);
                    }
                }
            }
        }
        return true;
    }
}
