package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public enum CollisionBehavior {
    NOT_COLLIDE(0),
    ALWAYS_SHOW(1),
    HIDE_BY_PRIORITY(2),
    COLLIDE_WITH_INNER(4),
    COLLIDE_WITH_BASEPOI(8),
    COLLIDE_INNER_AND_BASEPOI(12);


    /* renamed from: b, reason: collision with root package name */
    private int f5774b;

    CollisionBehavior(int i8) {
        this.f5774b = i8;
    }

    public int getNumber() {
        return this.f5774b;
    }
}
