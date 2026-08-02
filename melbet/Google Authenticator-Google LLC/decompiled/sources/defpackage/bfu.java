package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfu implements bge {
    private final /* synthetic */ int a;
    private final Object b;

    public bfu(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.bge
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return afn.i((Uri) obj);
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            Uri uri = (Uri) obj;
            return afn.i(uri) && !afn.k(uri);
        }
        if (i != 5) {
            return true;
        }
        Uri uri2 = (Uri) obj;
        return afn.i(uri2) && afn.k(uri2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bfs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [bge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bge, java.lang.Object] */
    @Override // defpackage.bge
    public final /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        Uri c;
        Long l;
        int i3 = this.a;
        if (i3 == 0) {
            File file = (File) obj;
            return new bvw(new bls(file), new bfr(file, (bfs) this.b, 0));
        }
        if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new bvw(new bls(bArr), new bfg(bArr, this.b));
        }
        if (i3 == 2) {
            Uri uri = (Uri) obj;
            return new bvw(new bls(uri), new bga((Context) this.b, uri));
        }
        if (i3 == 3) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                c = null;
            } else if (str.charAt(0) == '/') {
                c = c(str);
            } else {
                Uri parse = Uri.parse(str);
                c = parse.getScheme() == null ? c(str) : parse;
            }
            if (c != null) {
                ?? r4 = this.b;
                if (r4.a(c)) {
                    return r4.b(c, i, i2, bblVar);
                }
            }
            return null;
        }
        if (i3 == 4) {
            Uri uri2 = (Uri) obj;
            if (!afn.j(i, i2)) {
                return null;
            }
            bls blsVar = new bls(uri2);
            Context context = (Context) this.b;
            return new bvw(blsVar, bfr.b(context, uri2, new bcl(context.getContentResolver())));
        }
        if (i3 != 5) {
            return this.b.b(new bfv((URL) obj), i, i2, bblVar);
        }
        Uri uri3 = (Uri) obj;
        if (!afn.j(i, i2) || (l = (Long) bblVar.b(bix.a)) == null || l.longValue() != -1) {
            return null;
        }
        bls blsVar2 = new bls(uri3);
        Context context2 = (Context) this.b;
        return new bvw(blsVar2, bfr.b(context2, uri3, new bcm(context2.getContentResolver())));
    }

    public bfu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public bfu(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
