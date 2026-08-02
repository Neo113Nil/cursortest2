package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public interface ViewFactory {
    View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup);

    KClass getType();
}
