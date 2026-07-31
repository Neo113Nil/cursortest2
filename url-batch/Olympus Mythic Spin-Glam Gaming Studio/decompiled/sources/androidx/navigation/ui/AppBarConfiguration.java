package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import java.util.Set;

/* loaded from: classes10.dex */
public final class AppBarConfiguration {
    private final OnNavigateUpListener mFallbackOnNavigateUpListener;
    private final Openable mOpenableLayout;
    private final Set mTopLevelDestinations;

    public static final class Builder {
    }

    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    public Set getTopLevelDestinations() {
        return this.mTopLevelDestinations;
    }

    public Openable getOpenableLayout() {
        return this.mOpenableLayout;
    }

    public OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.mFallbackOnNavigateUpListener;
    }
}
