package coil.transition;

import coil.request.ImageResult;
import coil.transition.NoneTransition;

/* compiled from: Transition.kt */
/* loaded from: classes13.dex */
public interface Transition {
    void transition();

    /* compiled from: Transition.kt */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Factory NONE = new NoneTransition.Factory();

        Transition create(TransitionTarget transitionTarget, ImageResult imageResult);

        /* compiled from: Transition.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }
    }
}
