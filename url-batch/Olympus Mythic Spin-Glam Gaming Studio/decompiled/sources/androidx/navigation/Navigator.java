package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes13.dex */
public abstract class Navigator<D extends NavDestination> {

    public interface Extras {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    public abstract NavDestination createDestination();

    public abstract NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Extras extras);

    public void onRestoreState(Bundle bundle) {
    }

    public Bundle onSaveState() {
        return null;
    }

    public abstract boolean popBackStack();
}
