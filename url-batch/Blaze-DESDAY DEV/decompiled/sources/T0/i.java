package T0;

import android.content.Intent;
import android.view.View;
import com.winworm.neongrid.ui.GameActivity;
import com.winworm.neongrid.ui.ResultActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f842c;

    public /* synthetic */ i(int i, ResultActivity resultActivity) {
        this.f840a = 1;
        this.f841b = i;
        this.f842c = resultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f841b;
        Object obj = this.f842c;
        switch (this.f840a) {
            case 0:
                int i2 = ResultActivity.f2058z;
                ResultActivity resultActivity = (ResultActivity) obj;
                g1.d.e(resultActivity, "context");
                Intent putExtra = new Intent(resultActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i);
                g1.d.d(putExtra, "putExtra(...)");
                resultActivity.startActivity(putExtra);
                resultActivity.finish();
                break;
            case 1:
                int i3 = ResultActivity.f2058z;
                int i4 = i + 1;
                if (i4 > 12) {
                    i4 = 12;
                }
                ResultActivity resultActivity2 = (ResultActivity) obj;
                g1.d.e(resultActivity2, "context");
                Intent putExtra2 = new Intent(resultActivity2, (Class<?>) GameActivity.class).putExtra("extra_level", i4);
                g1.d.d(putExtra2, "putExtra(...)");
                resultActivity2.startActivity(putExtra2);
                resultActivity2.finish();
                break;
            default:
                ((f) obj).d.e(Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i, int i2) {
        this.f840a = i2;
        this.f842c = obj;
        this.f841b = i;
    }
}
