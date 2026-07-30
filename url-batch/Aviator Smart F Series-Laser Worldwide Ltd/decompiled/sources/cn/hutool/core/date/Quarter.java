package cn.hutool.core.date;

/* loaded from: classes.dex */
public enum Quarter {
    Q1(1),
    Q2(2),
    Q3(3),
    Q4(4);

    private final int value;

    Quarter(int i8) {
        this.value = i8;
    }

    public static Quarter of(int i8) {
        if (i8 == 1) {
            return Q1;
        }
        if (i8 == 2) {
            return Q2;
        }
        if (i8 == 3) {
            return Q3;
        }
        if (i8 != 4) {
            return null;
        }
        return Q4;
    }

    public int getValue() {
        return this.value;
    }
}
