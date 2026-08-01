package T0;

import android.content.Intent;
import com.winworm.neongrid.ui.GameActivity;
import com.winworm.neongrid.ui.LevelsActivity;
import f1.l;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LevelsActivity f839a;

    @Override // f1.l
    public final Object e(Object obj) {
        int intValue = ((Integer) obj).intValue();
        int i = LevelsActivity.f2054B;
        LevelsActivity levelsActivity = this.f839a;
        g1.d.e(levelsActivity, "context");
        Intent putExtra = new Intent(levelsActivity, (Class<?>) GameActivity.class).putExtra("extra_level", intValue);
        g1.d.d(putExtra, "putExtra(...)");
        levelsActivity.startActivity(putExtra);
        return U0.f.f904c;
    }
}
