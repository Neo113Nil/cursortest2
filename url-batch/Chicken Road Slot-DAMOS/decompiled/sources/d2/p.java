package d2;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, int i3) {
        super(0);
        this.f3499d = i3;
        this.f3500e = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        switch (this.f3499d) {
            case 0:
                Boolean bool = (Boolean) this.f3500e.D.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = this.f3500e.getConfiguration().getLocales();
                k3.f fVar = new k3.f(new k3.g(locales));
                if (locales.isEmpty()) {
                    fVar = new k3.f(new k3.g(LocaleList.getDefault()));
                }
                k3.g gVar = fVar.f5382a;
                int size = gVar.f5383a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Locale locale = gVar.f5383a.get(i3);
                    locale.getClass();
                    arrayList.add(new s2.a(locale));
                }
                return new s2.b(arrayList);
            case 2:
                v vVar = this.f3500e;
                MotionEvent motionEvent = vVar.I0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    vVar.J0 = SystemClock.uptimeMillis();
                    vVar.post(vVar.O0);
                }
                return Unit.f5554a;
            default:
                this.f3500e.get_viewTreeOwners();
                return null;
        }
    }
}
