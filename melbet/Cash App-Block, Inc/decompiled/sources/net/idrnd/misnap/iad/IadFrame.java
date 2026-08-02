package net.idrnd.misnap.iad;

import android.graphics.YuvImage;
import androidx.media3.common.MediaItem;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;

/* loaded from: classes4.dex */
public final class IadFrame {
    public final /* synthetic */ int $r8$classId;
    public long b;

    public IadFrame() {
        this.$r8$classId = 1;
        this.b = Long.MIN_VALUE;
    }

    public MediaItem.ClippingProperties buildClippingProperties() {
        return new MediaItem.ClippingProperties(this);
    }

    public void finalize() {
        switch (this.$r8$classId) {
            case 4:
                long j = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                ColorGrading.nDestroyBuilder(j);
                break;
            case 5:
                long j2 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused2) {
                }
                Engine.nDestroyBuilder(j2);
                break;
            case 6:
                long j3 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused3) {
                }
                IndexBuffer.nDestroyBuilder(j3);
                break;
            case 7:
                long j4 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused4) {
                }
                IndirectLight.nDestroyBuilder(j4);
                break;
            case 8:
                long j5 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused5) {
                }
                LightManager.nDestroyBuilder(j5);
                break;
            case 9:
                long j6 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused6) {
                }
                RenderableManager.nDestroyBuilder(j6);
                break;
            case 10:
                long j7 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused7) {
                }
                Skybox.nDestroyBuilder(j7);
                break;
            case 11:
                long j8 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused8) {
                }
                Texture.nDestroyBuilder(j8);
                break;
            case 12:
                long j9 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused9) {
                }
                VertexBuffer.nDestroyBuilder(j9);
                break;
            default:
                super.finalize();
                break;
        }
    }

    public /* synthetic */ IadFrame(long j, int i) {
        this.$r8$classId = i;
        this.b = j;
    }

    public IadFrame(YuvImage yuvImage, long j, int i) {
        this.$r8$classId = 0;
        this.b = j;
    }
}
