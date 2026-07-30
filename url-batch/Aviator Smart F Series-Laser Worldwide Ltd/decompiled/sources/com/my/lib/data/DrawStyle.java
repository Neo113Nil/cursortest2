package com.my.lib.data;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class DrawStyle {
    private final String avatarUrl;
    private final String name;
    private final int value;

    public DrawStyle(String avatarUrl, int i8, String name) {
        s.checkNotNullParameter(avatarUrl, "avatarUrl");
        s.checkNotNullParameter(name, "name");
        this.avatarUrl = avatarUrl;
        this.value = i8;
        this.name = name;
    }

    public static /* synthetic */ DrawStyle copy$default(DrawStyle drawStyle, String str, int i8, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = drawStyle.avatarUrl;
        }
        if ((i9 & 2) != 0) {
            i8 = drawStyle.value;
        }
        if ((i9 & 4) != 0) {
            str2 = drawStyle.name;
        }
        return drawStyle.copy(str, i8, str2);
    }

    public final String component1() {
        return this.avatarUrl;
    }

    public final int component2() {
        return this.value;
    }

    public final String component3() {
        return this.name;
    }

    public final DrawStyle copy(String avatarUrl, int i8, String name) {
        s.checkNotNullParameter(avatarUrl, "avatarUrl");
        s.checkNotNullParameter(name, "name");
        return new DrawStyle(avatarUrl, i8, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawStyle)) {
            return false;
        }
        DrawStyle drawStyle = (DrawStyle) obj;
        return s.areEqual(this.avatarUrl, drawStyle.avatarUrl) && this.value == drawStyle.value && s.areEqual(this.name, drawStyle.name);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.name.hashCode() + ((this.value + (this.avatarUrl.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "DrawStyle(avatarUrl=" + this.avatarUrl + ", value=" + this.value + ", name=" + this.name + ")";
    }
}
