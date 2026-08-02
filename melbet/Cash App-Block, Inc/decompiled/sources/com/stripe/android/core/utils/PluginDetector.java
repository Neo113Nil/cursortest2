package com.stripe.android.core.utils;

import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;

/* loaded from: classes8.dex */
public final class PluginDetector {
    public static final String pluginType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PluginType {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ PluginType[] $VALUES;
        public final String className;
        public final String pluginName;

        static {
            PluginType[] pluginTypeArr = {new PluginType("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native"), new PluginType("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter"), new PluginType("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova"), new PluginType("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity")};
            $VALUES = pluginTypeArr;
            $ENTRIES = new EnumEntriesList(pluginTypeArr);
        }

        public PluginType(String str, int i, String str2, String str3) {
            this.className = str2;
            this.pluginName = str3;
        }

        public static PluginType valueOf(String str) {
            return (PluginType) Enum.valueOf(PluginType.class, str);
        }

        public static PluginType[] values() {
            return (PluginType[]) $VALUES.clone();
        }
    }

    static {
        Object obj;
        EnumEntriesList enumEntriesList = PluginType.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            String str = ((PluginType) obj).className;
            try {
                Class.forName(str);
                break;
            } catch (ClassNotFoundException e) {
                Log.d("PluginDetector", str + " not found: " + e);
            }
        }
        PluginType pluginType2 = (PluginType) obj;
        pluginType = pluginType2 != null ? pluginType2.pluginName : null;
    }
}
