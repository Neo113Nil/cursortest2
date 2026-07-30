package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.internal.Utility;
import defpackage.aa2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class va0 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(zn1 zn1Var, ab0 ab0Var, fn2 fn2Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 0;
        this.n = zn1Var;
        this.o = ab0Var;
        this.p = fn2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                return new va0((zn1) this.n, (ab0) obj3, (fn2) obj2, o30Var);
            case 1:
                va0 va0Var = new va0((x22) obj3, (bu2) obj2, o30Var, 1);
                va0Var.n = obj;
                return va0Var;
            case 2:
                va0 va0Var2 = new va0((ij1) obj3, (Uri) obj2, o30Var, 2);
                va0Var2.n = obj;
                return va0Var2;
            default:
                va0 va0Var3 = new va0((Context) obj3, (Uri) obj2, o30Var, 3);
                va0Var3.n = obj;
                return va0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((va0) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Object ba2Var;
        File file;
        InputStream openInputStream;
        Object ba2Var2;
        BufferedReader bufferedReader;
        int i = this.m;
        o30 o30Var = null;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                ab0 ab0Var = (ab0) obj3;
                fn2 fn2Var = (fn2) obj2;
                for (cp1 cp1Var : (Set) ((zn1) this.n).getValue()) {
                    if (!((List) ab0Var.b().e.m.getValue()).contains(cp1Var) && !fn2Var.contains(cp1Var)) {
                        ab0Var.b().b(cp1Var);
                    }
                }
                return Unit.a;
            case 1:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                a50 a50Var = (a50) this.n;
                d50 d50Var = d50.m;
                x22 x22Var = (x22) obj3;
                bu2 bu2Var = (bu2) obj2;
                z71.H(a50Var, null, new n40(x22Var, bu2Var, o30Var, 1), 1);
                return z71.H(a50Var, null, new n40(x22Var, bu2Var, o30Var, 2), 1);
            case 2:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                Context context = ((ij1) obj3).a;
                Uri uri = (Uri) obj2;
                try {
                    aa2.a aVar = aa2.m;
                    File file2 = new File(context.getFilesDir(), "images");
                    file2.mkdirs();
                    file = new File(file2, "img_" + UUID.randomUUID() + ".jpg");
                    openInputStream = context.getContentResolver().openInputStream(uri);
                    openInputStream.getClass();
                } catch (Throwable th) {
                    aa2.a aVar2 = aa2.m;
                    ba2Var = new ba2(th);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bd3.o(openInputStream, fileOutputStream);
                        fileOutputStream.close();
                        openInputStream.close();
                        ba2Var = file.getAbsolutePath();
                        if (ba2Var instanceof ba2) {
                            return null;
                        }
                        return ba2Var;
                    } finally {
                    }
                } finally {
                }
            default:
                b50 b50Var4 = b50.m;
                ca2.b(obj);
                Context context2 = (Context) obj3;
                Uri uri2 = (Uri) obj2;
                try {
                    aa2.a aVar3 = aa2.m;
                    InputStream openInputStream2 = context2.getContentResolver().openInputStream(uri2);
                    openInputStream2.getClass();
                    bufferedReader = new BufferedReader(new InputStreamReader(openInputStream2, yt.b), Utility.DEFAULT_STREAM_BUFFER_SIZE);
                } catch (Throwable th2) {
                    aa2.a aVar4 = aa2.m;
                    ba2Var2 = new ba2(th2);
                }
                try {
                    ba2Var2 = yh2.r(bufferedReader);
                    bufferedReader.close();
                    if (ba2Var2 instanceof ba2) {
                        return null;
                    }
                    return ba2Var2;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va0(Object obj, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
    }
}
