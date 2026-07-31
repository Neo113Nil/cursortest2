package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes14.dex */
public class NavigatorProvider {
    private static final HashMap sAnnotationNames = new HashMap();
    private final HashMap mNavigators = new HashMap();

    private static boolean validateName(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    static String getNameForNavigator(Class cls) {
        HashMap hashMap = sAnnotationNames;
        String str = (String) hashMap.get(cls);
        if (str == null) {
            Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
            str = name != null ? name.value() : null;
            if (!validateName(str)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            hashMap.put(cls, str);
        }
        return str;
    }

    public final Navigator getNavigator(Class cls) {
        return getNavigator(getNameForNavigator(cls));
    }

    public Navigator getNavigator(String str) {
        if (!validateName(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator = (Navigator) this.mNavigators.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Navigator addNavigator(Navigator navigator) {
        return addNavigator(getNameForNavigator(navigator.getClass()), navigator);
    }

    public Navigator addNavigator(String str, Navigator navigator) {
        if (!validateName(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        return (Navigator) this.mNavigators.put(str, navigator);
    }

    Map getNavigators() {
        return this.mNavigators;
    }
}
