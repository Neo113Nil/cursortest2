package com.yanzhenjie.recyclerview;

/* loaded from: classes4.dex */
public class j {
    private final b mController;
    private final int mDirection;
    private final int mPosition;

    public j(b bVar, int i8, int i9) {
        this.mController = bVar;
        this.mDirection = i8;
        this.mPosition = i9;
    }

    public void closeMenu() {
        this.mController.smoothCloseMenu();
    }

    public int getDirection() {
        return this.mDirection;
    }

    public int getPosition() {
        return this.mPosition;
    }
}
