package w0;

import android.content.Intent;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.VictoryActivity;
import com.fortunequest.neontrack.ui.NeonHabitBoardView;
import com.fortunequest.neontrack.ui.StarrySkyView;
import java.util.ArrayList;
import java.util.Iterator;
import t0.C0358k;

/* loaded from: classes.dex */
public final class e implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4482b;

    public /* synthetic */ e(View view, int i) {
        this.f4481a = i;
        this.f4482b = view;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        DailyQuestActivity dailyQuestActivity;
        C0358k c0358k;
        switch (this.f4481a) {
            case 0:
                NeonHabitBoardView neonHabitBoardView = (NeonHabitBoardView) this.f4482b;
                neonHabitBoardView.i += 0.05f;
                Iterator it = neonHabitBoardView.f2115f.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar.f4474c) {
                        float f2 = bVar.d + 0.04f;
                        bVar.d = f2;
                        if (f2 >= 1.0f) {
                            bVar.f4474c = false;
                        } else {
                            z2 = true;
                        }
                    }
                }
                for (d dVar : neonHabitBoardView.f2116g) {
                    if (dVar.f4480g) {
                        dVar.f4475a += dVar.f4477c;
                        float f3 = dVar.f4476b;
                        float f4 = dVar.d;
                        dVar.f4476b = f3 + f4;
                        dVar.d = f4 + 0.15f;
                        float f5 = dVar.f4478e - 0.025f;
                        dVar.f4478e = f5;
                        if (f5 <= RecyclerView.f1937A0) {
                            dVar.f4480g = false;
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    neonHabitBoardView.invalidate();
                } else if (neonHabitBoardView.f2117j) {
                    neonHabitBoardView.f2117j = false;
                    c cVar = neonHabitBoardView.h;
                    if (cVar != null && (c0358k = (dailyQuestActivity = (DailyQuestActivity) cVar).f2075B) != null && !dailyQuestActivity.f2074A) {
                        dailyQuestActivity.f2074A = true;
                        Intent intent = new Intent(dailyQuestActivity, (Class<?>) VictoryActivity.class);
                        intent.putExtra("extra_streak", c0358k.f4137a);
                        intent.putExtra("extra_multiplier", c0358k.f4138b);
                        intent.putExtra("extra_level", c0358k.f4139c);
                        dailyQuestActivity.startActivity(intent);
                        dailyQuestActivity.finish();
                    }
                }
                if (!z2) {
                    ArrayList arrayList = neonHabitBoardView.f2115f;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((b) it2.next()).f4474c) {
                            }
                        }
                        break;
                    }
                }
                Choreographer.getInstance().postFrameCallback(this);
                break;
            default:
                StarrySkyView starrySkyView = (StarrySkyView) this.f4482b;
                starrySkyView.f2121c += 0.016f;
                starrySkyView.invalidate();
                Choreographer.getInstance().postFrameCallback(this);
                break;
        }
    }
}
