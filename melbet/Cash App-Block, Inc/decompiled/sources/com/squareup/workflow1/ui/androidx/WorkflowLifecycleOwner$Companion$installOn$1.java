package com.squareup.workflow1.ui.androidx;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* loaded from: classes8.dex */
public final class WorkflowLifecycleOwner$Companion$installOn$1 extends Lambda implements Function1 {
    public static final WorkflowLifecycleOwner$Companion$installOn$1 INSTANCE = new WorkflowLifecycleOwner$Companion$installOn$1(1);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Lifecycle lifecycle;
        View view = (View) obj;
        view.getClass();
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            LifecycleOwner lifecycleOwner = DBUtil.get(view2);
            if (lifecycleOwner == null) {
                Context context = view2.getContext();
                context.getClass();
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LifecycleOwner.class);
                while (!orCreateKotlinClass.isInstance(context)) {
                    ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                    if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                        context = null;
                        break;
                    }
                }
                KClasses.cast(orCreateKotlinClass, context);
                lifecycleOwner = (LifecycleOwner) context;
            }
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
                if (lifecycle == null) {
                    return lifecycle;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Expected parent or context of ", view, " to have or be a ViewTreeLifecycleOwner");
                return null;
            }
        }
        lifecycle = null;
        if (lifecycle == null) {
        }
    }
}
