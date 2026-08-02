package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bii implements bij {
    private final List a;
    private final bek b;
    private final /* synthetic */ int c;
    private final Object d;

    public bii(ParcelFileDescriptor parcelFileDescriptor, List list, bek bekVar, int i) {
        this.c = i;
        this.b = bekVar;
        this.a = list;
        this.d = new bci(parcelFileDescriptor);
    }

    @Override // defpackage.bij
    public final int a() {
        if (this.c != 0) {
            return afn.p(this.a, ((bcf) this.d).a(), this.b);
        }
        return afn.l(this.a, new bbc((bci) this.d, this.b, 2));
    }

    @Override // defpackage.bij
    public final Bitmap b(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        int i = this.c;
        Object obj = this.d;
        if (i != 0) {
            return ajz.k(((bcf) obj).a(), options, this);
        }
        FileDescriptor fileDescriptor = ((bci) obj).a().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !bif.a(options) || !ajz.m(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        Bitmap.Config config5 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        a.T(config5 == config, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (decodeFileDescriptor == null) {
                config4 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config4;
                return null;
            }
            try {
                Bitmap l = ajz.l(decodeFileDescriptor);
                decodeFileDescriptor.recycle();
                config3 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config3;
                return l;
            } catch (Throwable th) {
                th = th;
                bitmap = decodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                config2 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.bij
    public final ImageHeaderParser$ImageType c() {
        if (this.c != 0) {
            return afn.q(this.a, ((bcf) this.d).a(), this.b);
        }
        return afn.n(this.a, new bbb((bci) this.d, this.b));
    }

    @Override // defpackage.bij
    public final void d() {
        if (this.c != 0) {
            ((bcf) this.d).a.a();
        }
    }

    @Override // defpackage.bij
    public final boolean e() {
        int i = this.c;
        Object obj = this.d;
        if (i == 0) {
            return afn.o(this.a, new bbd((bci) obj, this.b, 2));
        }
        InputStream a = ((bcf) obj).a();
        a.mark(5242880);
        return afn.o(this.a, new bbd(a, this.b, 0));
    }

    public bii(InputStream inputStream, List list, bek bekVar, int i) {
        this.c = i;
        this.b = bekVar;
        this.a = list;
        this.d = new bcf(inputStream, bekVar);
    }
}
