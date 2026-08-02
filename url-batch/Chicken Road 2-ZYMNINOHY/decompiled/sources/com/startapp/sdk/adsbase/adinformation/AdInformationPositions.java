package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;
import java.util.Locale;

/* loaded from: classes.dex */
public class AdInformationPositions {
    protected static final String DEFAULT_POSITION = Position.BOTTOM_LEFT.name();
    public static final String OBJECT_PROPERY_GLOBAL_NAME = "Positions";

    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);

        private int animationMultiplier;
        private int index;
        private int[] rules;

        Position(int i4, int[] iArr, int i5) {
            this.rules = iArr;
            this.animationMultiplier = i5;
            this.index = i4;
        }

        public static Position getByIndex(long j4) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i4 = 0; i4 < values.length; i4++) {
                if (values[i4].getIndex() == j4) {
                    position = values[i4];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i4 = 0; i4 < values.length; i4++) {
                String name = values[i4].name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    position = values[i4];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i4 >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i4]);
                i4++;
            }
        }

        public Position flipHorizontal() {
            int i4 = b.f6353a[ordinal()];
            if (i4 == 1) {
                return TOP_RIGHT;
            }
            if (i4 == 2) {
                return TOP_LEFT;
            }
            if (i4 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i4 == 4) {
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
