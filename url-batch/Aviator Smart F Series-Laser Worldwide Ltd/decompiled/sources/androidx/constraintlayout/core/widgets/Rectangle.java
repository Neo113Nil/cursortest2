package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f126x;

    /* renamed from: y, reason: collision with root package name */
    public int f127y;

    public boolean contains(int i8, int i9) {
        int i10;
        int i11 = this.f126x;
        return i8 >= i11 && i8 < i11 + this.width && i9 >= (i10 = this.f127y) && i9 < i10 + this.height;
    }

    public int getCenterX() {
        return (this.f126x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f127y + this.height) / 2;
    }

    void grow(int i8, int i9) {
        this.f126x -= i8;
        this.f127y -= i9;
        this.width += i8 * 2;
        this.height += i9 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i8;
        int i9;
        int i10 = this.f126x;
        int i11 = rectangle.f126x;
        return i10 >= i11 && i10 < i11 + rectangle.width && (i8 = this.f127y) >= (i9 = rectangle.f127y) && i8 < i9 + rectangle.height;
    }

    public void setBounds(int i8, int i9, int i10, int i11) {
        this.f126x = i8;
        this.f127y = i9;
        this.width = i10;
        this.height = i11;
    }
}
