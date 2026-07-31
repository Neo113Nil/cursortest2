package com.unity3d.player;

/* loaded from: classes2.dex */
public interface ISoftInputListener {
    void hide();

    boolean isConsumeOutsideTouchesEnabled();

    void setCharacterLimit(int i4);

    void setHideInputField(boolean z4);

    void setSelection(int i4, int i5);

    void setText(String str);

    void show(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9);
}
