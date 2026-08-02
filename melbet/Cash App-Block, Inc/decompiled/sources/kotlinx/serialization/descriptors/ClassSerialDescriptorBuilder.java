package kotlinx.serialization.descriptors;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class ClassSerialDescriptorBuilder {
    public final String serialName;
    public List annotations = EmptyList.INSTANCE;
    public final ArrayList elementNames = new ArrayList();
    public final HashSet uniqueNames = new HashSet();
    public final ArrayList elementDescriptors = new ArrayList();
    public final ArrayList elementAnnotations = new ArrayList();
    public final ArrayList elementOptionality = new ArrayList();

    public ClassSerialDescriptorBuilder(String str) {
        this.serialName = str;
    }

    public final void element(String str, SerialDescriptor serialDescriptor, List list, boolean z) {
        str.getClass();
        serialDescriptor.getClass();
        list.getClass();
        if (!this.uniqueNames.add(str)) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Element with name '", str, "' is already registered in ");
            m3m.append(this.serialName);
            throw new IllegalArgumentException(m3m.toString().toString());
        }
        this.elementNames.add(str);
        this.elementDescriptors.add(serialDescriptor);
        this.elementAnnotations.add(list);
        this.elementOptionality.add(Boolean.valueOf(z));
    }
}
