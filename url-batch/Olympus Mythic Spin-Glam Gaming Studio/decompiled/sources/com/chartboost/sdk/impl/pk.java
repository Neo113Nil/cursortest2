package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.net.URL;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public interface pk {
    long a();

    View a(Context context);

    Object a(Context context, URL url, b7 b7Var, Continuation continuation);

    void a(nh nhVar);

    void a(qk qkVar);

    Bitmap b();

    long c();

    float getVolume();

    void pause();

    void play();

    void release();

    void setVolume(float f);
}
