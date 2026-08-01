package V0;

import android.content.Intent;
import com.winfour.neondrop.ui.GameActivity;
import com.winfour.neondrop.ui.LevelsActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements f1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LevelsActivity f942a;

    @Override // f1.l
    public final Object c(Object obj) {
        U0.e eVar = (U0.e) obj;
        int i = LevelsActivity.f2113A;
        g1.d.e(eVar, "level");
        LevelsActivity levelsActivity = this.f942a;
        g1.d.e(levelsActivity, "context");
        Intent putExtra = new Intent(levelsActivity, (Class<?>) GameActivity.class).putExtra("extra_level", eVar.f865a);
        g1.d.d(putExtra, "putExtra(...)");
        levelsActivity.startActivity(putExtra);
        return W0.e.f956c;
    }
}
