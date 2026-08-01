package V0;

import a.AbstractC0058a;
import android.view.Choreographer;
import android.view.View;
import com.winpower.neonfit.ui.CalorieCoreView;
import com.winpower.neonfit.ui.StarrySkyView;
import com.winpower.neonfit.ui.TargetCrashView;
import j1.h;
import java.util.ArrayList;
import java.util.Iterator;
import l1.AbstractC0211d;

/* loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1322b;

    public /* synthetic */ a(View view, int i) {
        this.f1321a = i;
        this.f1322b = view;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f1321a) {
            case 0:
                CalorieCoreView calorieCoreView = (CalorieCoreView) this.f1322b;
                if (calorieCoreView.e) {
                    calorieCoreView.f2619f += 0.08f;
                    calorieCoreView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                    break;
                }
                break;
            case 1:
                StarrySkyView starrySkyView = (StarrySkyView) this.f1322b;
                if (starrySkyView.f2632d) {
                    starrySkyView.e += 0.016f;
                    float width = starrySkyView.getWidth();
                    float height = starrySkyView.getHeight();
                    if (width > 0.0f && height > 0.0f) {
                        Iterator it = starrySkyView.f2629a.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            float f2 = bVar.f1324b + bVar.f1326d;
                            bVar.f1324b = f2;
                            if (f2 > height) {
                                bVar.f1324b = 0.0f;
                                bVar.f1323a = AbstractC0211d.f3269a.c() * width;
                            }
                        }
                    }
                    starrySkyView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                    break;
                }
                break;
            default:
                TargetCrashView targetCrashView = (TargetCrashView) this.f1322b;
                if (targetCrashView.f2637d) {
                    targetCrashView.e = targetCrashView.e + 0.016f;
                    targetCrashView.f2638f = ((float) Math.sin(r8 * 40.0f)) * 6.0f;
                    targetCrashView.f2639g = ((float) Math.cos(targetCrashView.e * 35.0f)) * 6.0f;
                    ArrayList arrayList = targetCrashView.f2634a;
                    Iterator it2 = arrayList.iterator();
                    h.d(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        h.d(next, "next(...)");
                        d dVar = (d) next;
                        dVar.f1333a += dVar.f1335c;
                        float f3 = dVar.f1334b;
                        float f4 = dVar.f1336d;
                        dVar.f1334b = f3 + f4;
                        dVar.f1336d = f4 + 0.15f;
                        float f5 = dVar.f1337f - 0.012f;
                        dVar.f1337f = f5;
                        if (f5 <= 0.0f) {
                            it2.remove();
                        }
                    }
                    if (arrayList.size() < 40 && targetCrashView.e % 0.5f < 0.02f) {
                        targetCrashView.a();
                    }
                    Iterator it3 = targetCrashView.f2635b.iterator();
                    while (it3.hasNext()) {
                        c cVar = (c) it3.next();
                        cVar.f1329b -= cVar.f1332f;
                        float f6 = 255;
                        cVar.e = AbstractC0058a.m((int) (f6 - ((targetCrashView.e * 40.0f) % f6)), 120, 255);
                    }
                    targetCrashView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                    break;
                }
                break;
        }
    }
}
