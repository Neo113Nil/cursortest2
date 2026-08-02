package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class Visibilities {
    public static final Visibilities INSTANCE = new Visibilities();
    public static final MapBuilder ORDERED_VISIBILITIES;

    public static final class Inherited extends Visibility {
        public static final Inherited INSTANCE = new Inherited("inherited", false);
    }

    public static final class Internal extends Visibility {
        public static final Internal INSTANCE = new Internal("internal", false);
    }

    public static final class InvisibleFake extends Visibility {
        public static final InvisibleFake INSTANCE = new InvisibleFake("invisible_fake", false);
    }

    public static final class Local extends Visibility {
        public static final Local INSTANCE = new Local("local", false);
    }

    public static final class Private extends Visibility {
        public static final Private INSTANCE = new Private("private", false);
    }

    public static final class PrivateToThis extends Visibility {
        public static final PrivateToThis INSTANCE = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {
        public static final Protected INSTANCE = new Protected("protected", true);
    }

    public static final class Public extends Visibility {
        public static final Public INSTANCE = new Public("public", true);
    }

    public static final class Unknown extends Visibility {
        public static final Unknown INSTANCE = new Unknown("unknown", false);
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(PrivateToThis.INSTANCE, 0);
        mapBuilder.put(Private.INSTANCE, 0);
        mapBuilder.put(Internal.INSTANCE, 1);
        mapBuilder.put(Protected.INSTANCE, 1);
        mapBuilder.put(Public.INSTANCE, 2);
        ORDERED_VISIBILITIES = mapBuilder.build();
    }

    public final Integer compareLocal$compiler_common(Visibility visibility, Visibility visibility2) {
        visibility.getClass();
        visibility2.getClass();
        if (visibility == visibility2) {
            return 0;
        }
        MapBuilder mapBuilder = ORDERED_VISIBILITIES;
        Integer num = (Integer) mapBuilder.get(visibility);
        Integer num2 = (Integer) mapBuilder.get(visibility2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(Visibility visibility) {
        visibility.getClass();
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
