package com.fortuneink.neonpad;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class Stroke {
    private final int color;
    private final Path path;
    private final float width;

    public Stroke(int i, float f2, Path path) {
        X0.f.e(path, "path");
        this.color = i;
        this.width = f2;
        this.path = path;
    }

    public static /* synthetic */ Stroke copy$default(Stroke stroke, int i, float f2, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stroke.color;
        }
        if ((i2 & 2) != 0) {
            f2 = stroke.width;
        }
        if ((i2 & 4) != 0) {
            path = stroke.path;
        }
        return stroke.copy(i, f2, path);
    }

    public final int component1() {
        return this.color;
    }

    public final float component2() {
        return this.width;
    }

    public final Path component3() {
        return this.path;
    }

    public final Stroke copy(int i, float f2, Path path) {
        X0.f.e(path, "path");
        return new Stroke(i, f2, path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.color == stroke.color && Float.compare(this.width, stroke.width) == 0 && X0.f.a(this.path, stroke.path);
    }

    public final int getColor() {
        return this.color;
    }

    public final Path getPath() {
        return this.path;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.path.hashCode() + ((Float.hashCode(this.width) + (Integer.hashCode(this.color) * 31)) * 31);
    }

    public String toString() {
        return "Stroke(color=" + this.color + ", width=" + this.width + ", path=" + this.path + ")";
    }
}
