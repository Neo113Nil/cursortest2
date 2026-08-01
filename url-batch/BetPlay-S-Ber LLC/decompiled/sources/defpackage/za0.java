package defpackage;

import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class za0 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    ac0 mDispachedInsets;
    private final int mDispatchMode = 0;

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(gb0 gb0Var);

    public abstract void onPrepare(gb0 gb0Var);

    public abstract ac0 onProgress(ac0 ac0Var, List list);

    public abstract ya0 onStart(gb0 gb0Var, ya0 ya0Var);
}
