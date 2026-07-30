package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public enum ParticleEffectType {
    UnKnow(-1),
    Snow(0),
    RainStorm(4),
    Smog(5),
    SandStorm(7),
    Fireworks(8),
    Flower(14);


    /* renamed from: b, reason: collision with root package name */
    private int f6125b;

    ParticleEffectType(int i8) {
        this.f6125b = i8;
    }

    public int getType() {
        return this.f6125b;
    }
}
