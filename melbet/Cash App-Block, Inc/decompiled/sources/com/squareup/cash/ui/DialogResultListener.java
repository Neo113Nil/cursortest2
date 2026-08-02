package com.squareup.cash.ui;

import app.cash.broadway.screen.Screen;

/* loaded from: classes.dex */
public interface DialogResultListener {
    void onDialogCanceled(Screen screen);

    void onDialogResult(Screen screen, Object obj);
}
