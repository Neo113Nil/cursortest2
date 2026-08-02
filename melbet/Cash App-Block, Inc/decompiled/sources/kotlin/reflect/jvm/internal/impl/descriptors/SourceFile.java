package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new AnonymousClass1(0);

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceFile$1, reason: invalid class name */
    public final class AnonymousClass1 implements ReceiverValue, SourceFile {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        public String getName() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            switch (this.$r8$classId) {
                case 1:
                    throw new IllegalStateException("This method should not be called");
                case 2:
                    throw new IllegalStateException("This method should not be called");
                default:
                    throw new IllegalStateException("This method should not be called");
            }
        }
    }

    String getName();
}
