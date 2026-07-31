package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;
import java.util.Locale;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AdInformationPositions {
    protected static final String DEFAULT_POSITION = Position.BOTTOM_LEFT.name();
    public static final String OBJECT_PROPERY_GLOBAL_NAME = "Positions";

    /* compiled from: Sta */
    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);

        private int animationMultiplier;
        private int index;
        private int[] rules;

        Position(int i, int[] iArr, int i2) {
            this.rules = iArr;
            this.animationMultiplier = i2;
            this.index = i;
        }

        public static Position getByIndex(long j) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].getIndex() == j) {
                    position = values[i];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i = 0; i < values.length; i++) {
                String name = values[i].name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    position = values[i];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i]);
                i++;
            }
        }

        public Position flipHorizontal() {
            int i = b.f125a[ordinal()];
            if (i == 1) {
                return TOP_RIGHT;
            }
            if (i == 2) {
                return TOP_LEFT;
            }
            if (i == 3) {
                return BOTTOM_RIGHT;
            }
            if (i == 4) {
                return BOTTOM_LEFT;
            }
            throw new IllegalStateException();
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }
}
