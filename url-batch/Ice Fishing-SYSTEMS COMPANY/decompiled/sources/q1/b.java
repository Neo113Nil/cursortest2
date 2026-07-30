package q1;

import com.bumptech.glide.manager.n;
import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f39890a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f39891b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f39892c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f39893d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39894e;

    /* renamed from: f, reason: collision with root package name */
    public n f39895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f39896g;

    public b(c cVar, String str) {
        this.f39896g = cVar;
        this.f39890a = str;
        int i = cVar.f39910z;
        this.f39891b = new long[i];
        this.f39892c = new File[i];
        this.f39893d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i4 = 0; i4 < cVar.f39910z; i4++) {
            sb.append(i4);
            File[] fileArr = this.f39892c;
            String sb2 = sb.toString();
            File file = cVar.f39904n;
            fileArr[i4] = new File(file, sb2);
            sb.append(".tmp");
            this.f39893d[i4] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j9 : this.f39891b) {
            sb.append(' ');
            sb.append(j9);
        }
        return sb.toString();
    }
}
