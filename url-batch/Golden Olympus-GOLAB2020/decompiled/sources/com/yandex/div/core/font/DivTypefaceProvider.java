package com.yandex.div.core.font;

import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes2.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getTypefaceFor(int i4) {
            Typeface create;
            if (Build.VERSION.SDK_INT < 28) {
                return super.getTypefaceFor(i4);
            }
            create = Typeface.create(Typeface.DEFAULT, i4, false);
            return create;
        }
    };

    Typeface getBold();

    Typeface getLight();

    Typeface getMedium();

    Typeface getRegular();

    default Typeface getTypefaceFor(int i4) {
        return (i4 < 0 || i4 >= 350) ? (i4 < 350 || i4 >= 450) ? (i4 < 450 || i4 >= 600) ? getBold() : getMedium() : getRegular() : getLight();
    }

    default boolean isVariable() {
        return false;
    }
}
