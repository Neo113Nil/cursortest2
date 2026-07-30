package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        s.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t7 = (T) this.application;
        s.checkNotNull(t7, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t7;
    }
}
