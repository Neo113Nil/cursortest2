package com.squareup.cash.ui;

import androidx.core.graphics.Insets;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class CashInsets {
    public final Map insets;

    /* loaded from: classes8.dex */
    public abstract class Companion {
        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewBenefitsLeaflet.deepLinkSpecs;
        }

        public static String getNameForNavigator$navigation_common_release(Class cls) {
            LinkedHashMap linkedHashMap = NavigatorProvider.annotationNames;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                str = name != null ? name.value() : null;
                if (str == null || str.length() <= 0) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) "No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                    return null;
                }
                linkedHashMap.put(cls, str);
            }
            str.getClass();
            return str;
        }

        public static CashInsets of(Pair... pairArr) {
            return new CashInsets((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type FloatingBottomNavigation;
        public static final Type InlineBottomNavigation;

        static {
            Type type2 = new Type("FloatingBottomNavigation", 0);
            FloatingBottomNavigation = type2;
            Type type3 = new Type("InlineBottomNavigation", 1);
            InlineBottomNavigation = type3;
            $VALUES = new Type[]{type2, type3};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CashInsets(Pair[] pairArr) {
        this.insets = MapsKt__MapsKt.toMap(pairArr);
    }

    public final Insets get(Type type2) {
        Insets insets = (Insets) this.insets.get(type2);
        return insets == null ? Insets.NONE : insets;
    }
}
