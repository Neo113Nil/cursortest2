package org.apache.commons.imaging;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class ImageWriteException extends ImagingException {
    private static final long serialVersionUID = -1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageWriteException(String str, Object obj) {
        super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r0, getType(obj), ")"));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(" (");
    }

    private static String getType(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((Object[]) obj).length, "]", new StringBuilder("[Object[]: "));
        }
        if (obj instanceof char[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((char[]) obj).length, "]", new StringBuilder("[char[]: "));
        }
        if (obj instanceof byte[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((byte[]) obj).length, "]", new StringBuilder("[byte[]: "));
        }
        if (obj instanceof short[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((short[]) obj).length, "]", new StringBuilder("[short[]: "));
        }
        if (obj instanceof int[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((int[]) obj).length, "]", new StringBuilder("[int[]: "));
        }
        if (obj instanceof long[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((long[]) obj).length, "]", new StringBuilder("[long[]: "));
        }
        if (obj instanceof float[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((float[]) obj).length, "]", new StringBuilder("[float[]: "));
        }
        if (obj instanceof double[]) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((double[]) obj).length, "]", new StringBuilder("[double[]: "));
        }
        if (!(obj instanceof boolean[])) {
            return obj.getClass().getName();
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((boolean[]) obj).length, "]", new StringBuilder("[boolean[]: "));
    }

    public ImageWriteException(String str, Throwable th) {
        super(str, th);
    }

    public ImageWriteException(String str) {
        super(str);
    }
}
