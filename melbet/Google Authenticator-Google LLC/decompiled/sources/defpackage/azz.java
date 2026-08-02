package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azz extends azx {
    public azz(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls.toString() + " and data: " + cls2.toString());
    }

    public azz(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public azz(Object obj, List list) {
        super("Found ModelLoaders for model class: " + String.valueOf(list) + ", but none that handle this specific model instance: " + String.valueOf(obj));
    }
}
