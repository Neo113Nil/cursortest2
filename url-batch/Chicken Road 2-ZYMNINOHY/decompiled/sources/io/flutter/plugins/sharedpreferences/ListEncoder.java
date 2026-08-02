package io.flutter.plugins.sharedpreferences;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ListEncoder implements SharedPreferencesListEncoder {
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    public List<String> decode(String listString) {
        i.e(listString, "listString");
        Object readObject = new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) readObject) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    public String encode(List<String> list) {
        i.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        i.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
