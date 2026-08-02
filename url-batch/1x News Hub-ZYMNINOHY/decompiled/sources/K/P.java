package K;

import a.AbstractC0129a;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class P implements InterfaceC0037a {

    /* renamed from: a, reason: collision with root package name */
    public final File f710a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f711b = new AtomicBoolean(false);

    public P(File file) {
        this.f710a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [K.P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(P p3, AbstractC0326c abstractC0326c) {
        O o;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (abstractC0326c instanceof O) {
            o = (O) abstractC0326c;
            int i3 = o.f709h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o.f709h = i3 - Integer.MIN_VALUE;
                Object obj = o.f;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                r22 = o.f709h;
                N.g gVar = N.g.f983a;
                boolean z = true;
                if (r22 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    if (p3.f711b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        fileInputStream = new FileInputStream(p3.f710a);
                    } catch (FileNotFoundException unused) {
                        if (!p3.f710a.exists()) {
                            return new N.b(z);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(p3.f710a);
                        try {
                            o.f706d = fileInputStream3;
                            o.f707e = null;
                            o.f709h = 2;
                            N.b a3 = gVar.a(fileInputStream3);
                            if (a3 != enumC0317a) {
                                obj = a3;
                                closeable = fileInputStream3;
                                AbstractC0129a.h(closeable, null);
                                return obj;
                            }
                            return enumC0317a;
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                    try {
                        o.f706d = p3;
                        o.f707e = fileInputStream;
                        o.f709h = 1;
                        N.b a4 = gVar.a(fileInputStream);
                        if (a4 != enumC0317a) {
                            fileInputStream2 = fileInputStream;
                            obj = a4;
                        }
                        return enumC0317a;
                    } catch (Throwable th4) {
                        r22 = p3;
                        fileInputStream2 = fileInputStream;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) o.f706d;
                    try {
                        android.support.v4.media.session.a.T(obj);
                        AbstractC0129a.h(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream2 = o.f707e;
                r22 = (P) o.f706d;
                try {
                    android.support.v4.media.session.a.T(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                AbstractC0129a.h(fileInputStream2, null);
                return obj;
            }
        }
        o = new O(p3, abstractC0326c);
        Object obj2 = o.f;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        r22 = o.f709h;
        N.g gVar2 = N.g.f983a;
        boolean z2 = true;
        if (r22 != 0) {
        }
        AbstractC0129a.h(fileInputStream2, null);
        return obj2;
    }

    @Override // K.InterfaceC0037a
    public final void close() {
        this.f711b.set(true);
    }
}
