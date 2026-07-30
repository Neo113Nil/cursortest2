package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.l0;
import kotlin.collections.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class SerializedMap implements Externalizable {
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public SerializedMap(Map<?, ?> map) {
        s.checkNotNullParameter(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Map createMapBuilder;
        Map<?, ?> build;
        s.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        createMapBuilder = l0.createMapBuilder(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            createMapBuilder.put(input.readObject(), input.readObject());
        }
        build = l0.build(createMapBuilder);
        this.map = build;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        s.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SerializedMap() {
        this(r0);
        Map emptyMap;
        emptyMap = m0.emptyMap();
    }
}
