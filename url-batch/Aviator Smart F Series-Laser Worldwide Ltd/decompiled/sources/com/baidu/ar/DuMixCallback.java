package com.baidu.ar;

/* loaded from: classes.dex */
public interface DuMixCallback {
    void onCaseCreate(boolean z7, String str, String str2);

    void onCaseDestroy();

    void onError(DuMixErrorType duMixErrorType, String str, String str2);

    void onRelease();

    void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput);
}
