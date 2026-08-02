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

        Position(int i3, int[] iArr, int i4) {
            this.rules = iArr;
            this.animationMultiplier = i4;
            this.index = i3;
        }

        public static Position getByIndex(long j3) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i3 = 0; i3 < values.length; i3++) {
                if (values[i3].getIndex() == j3) {
                    position = values[i3];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i3 = 0; i3 < values.length; i3++) {
                String name = values[i3].name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    position = values[i3];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i3 >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i3]);
                i3++;
            }
        }

        public Position flipHorizontal() {
            int i3 = b.f3264a[ordinal()];
            if (i3 == 1) {
                return TOP_RIGHT;
            }
            if (i3 == 2) {
                return TOP_LEFT;
            }
            if (i3 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i3 == 4) {
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
