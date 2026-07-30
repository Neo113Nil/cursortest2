package J6;

import com.icefishing.icefishingliveapp.StartActivity;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import l4.AbstractC4692b;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1416a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1416a) {
            case 0:
                ((Map) obj).clear();
                break;
            case 1:
                ((List) obj).clear();
                break;
            default:
                int i = StartActivity.f37053z;
                ((AbstractC4692b) obj).getClass();
                break;
        }
    }
}
