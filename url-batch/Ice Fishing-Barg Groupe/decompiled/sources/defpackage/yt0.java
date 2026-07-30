package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yt0 implements SerialDescriptor {
    public final /* synthetic */ cj0 PxuCJdSBwIXG;
    public static final yt0 lS5Rgt96tfkO = new yt0();
    public static final String TSizfFm2Yiuu = "kotlinx.serialization.json.JsonObject";

    public yt0() {
        KSerializer serializer = BuiltinSerializersKt.serializer(fa2.PxuCJdSBwIXG);
        qt0 qt0Var = qt0.PxuCJdSBwIXG;
        serializer.getClass();
        SerialDescriptor descriptor = serializer.getDescriptor();
        SerialDescriptor descriptor2 = qt0Var.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.PxuCJdSBwIXG = new cj0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        this.PxuCJdSBwIXG.OPXfSBeufaJ8(i);
        return p50.rtx2ld2ELZv4;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        this.PxuCJdSBwIXG.getClass();
        return wa2.RAsUl2FVSrh6;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        this.PxuCJdSBwIXG.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean a92UlCVFR9N8() {
        this.PxuCJdSBwIXG.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        this.PxuCJdSBwIXG.dgRBjINgWbAK(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        this.PxuCJdSBwIXG.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.PxuCJdSBwIXG.getClass();
        return p50.rtx2ld2ELZv4;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean rtx2ld2ELZv4() {
        this.PxuCJdSBwIXG.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        return this.PxuCJdSBwIXG.wdg6QnbFHrFF(i);
    }
}
