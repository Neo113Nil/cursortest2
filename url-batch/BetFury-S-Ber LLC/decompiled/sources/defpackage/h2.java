package defpackage;

import android.content.Context;
import androidx.fragment.app.b;
import com.trembin.nirefon.betfury.data.NoteDao_Impl;
import com.trembin.nirefon.betfury.data.NoteDatabase;
import com.trembin.nirefon.betfury.data.NoteDatabase_Impl;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements ir {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ir
    public final Object a() {
        NoteDao_Impl _noteDao$lambda$0;
        int i = this.f;
        sk0 sk0Var = sk0.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.g;
        switch (i) {
            case 0:
                m2 m2Var = (m2) obj;
                b D = m2Var.D();
                wi wiVar = new wi(D.d(), new kz(NoteDatabase.Companion.getDatabase(m2Var.D()).noteDao()), D.c());
                dc a = b90.a(NotesViewModel.class);
                String b = a.b();
                if (b != null) {
                    return (NotesViewModel) wiVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                }
                s9.k("Local and anonymous classes can not be ViewModels");
                return null;
            case 1:
                return ((i5) obj).c(":memory:");
            case 2:
                er erVar = (er) obj;
                Context context = erVar.f;
                String str = erVar.g;
                o0 o0Var = new o0(25, (boolean) (objArr == true ? 1 : 0));
                o0Var.g = null;
                dr drVar = new dr(context, str, o0Var, erVar.h);
                drVar.setWriteAheadLoggingEnabled(erVar.j);
                return drVar;
            case 3:
                NoteDatabase_Impl noteDatabase_Impl = ((uv) obj).a;
                return Boolean.valueOf(!noteDatabase_Impl.inCompatibilityMode$room_runtime_release() || noteDatabase_Impl.isOpenInternal());
            case 4:
                _noteDao$lambda$0 = NoteDatabase_Impl._noteDao$lambda$0((NoteDatabase_Impl) obj);
                return _noteDao$lambda$0;
            case 5:
                return new w40((y40) obj);
            case 6:
                ((Runnable) obj).run();
                return sk0Var;
            case 7:
                return ((Callable) obj).call();
            case 8:
                return bi.E((tm0) obj);
            default:
                sb0 sb0Var = (sb0) obj;
                sb0Var.e().a(new u70(objArr2 == true ? 1 : 0, sb0Var));
                return sk0Var;
        }
    }
}
