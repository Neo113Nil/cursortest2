package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Worker;
import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nb implements kri {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [amn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [agl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ame, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ame, java.lang.Object] */
    @Override // defpackage.kri
    public final Object a() {
        amv amvVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                oe oeVar = new oe(new nc(obj, objArr == true ? 1 : 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!ksp.b(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new at(obj, (Object) oeVar, 13, (char[]) (objArr2 == true ? 1 : 0)));
                        return oeVar;
                    }
                    ((ng) obj).w(oeVar);
                }
                return oeVar;
            case 1:
                ?? r12 = this.a;
                ng ngVar = (ng) r12;
                return new aga(ngVar.getApplication(), r12, ngVar.getIntent() != null ? ngVar.getIntent().getExtras() : null);
            case 2:
                ahh ahhVar = new ahh();
                ((nh) this.a).f().e().b(ahhVar);
                return ahhVar;
            case 3:
                return new oe(new nc(this.a, 3));
            case 4:
                return new nu((oe) this.a);
            case 5:
                return afx.b(this.a);
            case 6:
                ajw ajwVar = ((ajk) this.a).a;
                return Boolean.valueOf(!ajwVar.q() || ajwVar.s());
            case 7:
                this.a.run();
                return kow.a;
            case 8:
                return this.a.call();
            case 9:
                alh alhVar = (alh) this.a;
                ?? r0 = alhVar.d.a;
                String c = r0.c();
                String str = alhVar.a;
                if (c == null) {
                    if (!ksp.b(str, ":memory:")) {
                        throw new IllegalArgumentException(a.Z(str, "This driver is configured to open an in-memory database but a file-based named '", "' was requested."));
                    }
                } else if (!ksp.b(c, str) && !ksp.b(ksp.t(c, c), ksp.t(str, str))) {
                    throw new IllegalArgumentException("This driver is configured to open a database named '" + r0.c() + "' but '" + str + "' was requested.");
                }
                return new ana(r0.b());
            case 10:
                ?? r122 = this.a;
                r122.L().a(new ama(r122));
                return kow.a;
            case 11:
                amw amwVar = (amw) this.a;
                String str2 = amwVar.b;
                if (str2 == null || !amwVar.d) {
                    amvVar = new amv(amwVar.a, str2, new hrz(null, null), amwVar.c, amwVar.e);
                } else {
                    Context context = amwVar.a;
                    amvVar = new amv(context, new File(context.getNoBackupFilesDir(), str2).getAbsolutePath(), new hrz(null, null), amwVar.c, amwVar.e);
                }
                amvVar.setWriteAheadLoggingEnabled(amwVar.f);
                return amvVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((Worker) this.a).c();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ayi.a((auj) this.a);
                return kow.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new aye((ajw) this.a);
            case 15:
                return new awz((ajw) this.a);
            case 16:
                return new ayh((ajw) this.a);
            case 17:
                return new axk((ajw) this.a);
            case 18:
                return new axo((ajw) this.a);
            case 19:
                return new axq((ajw) this.a);
            default:
                return new axd((ajw) this.a);
        }
    }
}
