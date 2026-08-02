package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhf implements bbn {
    private final /* synthetic */ int a;
    private final Object b;

    public bhf(int i) {
        this.a = i;
        this.b = new bhd();
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [bed, java.lang.Object] */
    @Override // defpackage.bbn
    public final /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        int i3 = this.a;
        if (i3 == 0) {
            createSource = ImageDecoder.createSource((ByteBuffer) obj);
            return ((bhd) this.b).c(createSource, i, i2, bblVar);
        }
        if (i3 == 1) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            bhx bhxVar = (bhx) this.b;
            brn brnVar = bhxVar.i;
            return bhxVar.a(new bih(byteBuffer, bhxVar.g, bhxVar.h, brnVar != null && brnVar.v(azk.class)), i, i2, bblVar, bhx.f);
        }
        if (i3 == 2) {
            bhx bhxVar2 = (bhx) this.b;
            return bhxVar2.a(new bii((ParcelFileDescriptor) obj, bhxVar2.g, bhxVar2.h, 0), i, i2, bblVar, bhx.f);
        }
        if (i3 == 3) {
            createSource2 = ImageDecoder.createSource((ByteBuffer) obj);
            return afr.B(createSource2, i, i2, bblVar);
        }
        if (i3 != 4) {
            return bil.g(((bar) obj).a(), this.b);
        }
        createSource3 = ImageDecoder.createSource(blv.a((InputStream) obj, false));
        return afr.B(createSource3, i, i2, bblVar);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bbn
    public final /* synthetic */ boolean b(Object obj, bbl bblVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && bci.d();
        }
        if (i == 3) {
            return afr.C(afn.m(((afr) this.b).a, (ByteBuffer) obj));
        }
        if (i != 4) {
            return true;
        }
        afr afrVar = (afr) this.b;
        return afr.C(afn.q(afrVar.a, (InputStream) obj, (bek) afrVar.b));
    }

    public bhf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
