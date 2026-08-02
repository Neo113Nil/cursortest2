package papa;

import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public final class Choreographers {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.property1(new PropertyReference1Impl(Choreographers.class, "isInChoreographerFrameMessage", "isInChoreographerFrameMessage()Z", 0))};
    public static final Choreographers INSTANCE = new Choreographers();
    public static final ArrayList pendingRenderedCallbacks = new ArrayList();
    public static final OkHttpCall.AnonymousClass1 isInChoreographerFrameMessage$delegate = new OkHttpCall.AnonymousClass1(new Handlers$$ExternalSyntheticLambda1(12));

    public static void postOnCurrentFrameRendered$papa_release(OnFrameRenderedListener onFrameRenderedListener) {
        ArrayList arrayList = pendingRenderedCallbacks;
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(onFrameRenderedListener);
        if (isEmpty) {
            Handlers.onCurrentMainThreadMessageFinished(new Handlers$$ExternalSyntheticLambda1(13));
        }
    }
}
