package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1 shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo533mapZmokQxo(KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (((Boolean) Function1.this.invoke(androidx.compose.ui.input.key.KeyEvent.m1795boximpl(event))).booleanValue() && KeyEvent_androidKt.m1814isShiftPressedZmokQxo(event)) {
                    if (Key.m1781equalsimpl0(KeyEvent_androidKt.m1810getKeyZmokQxo(event), MappedKeys.INSTANCE.m565getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) Function1.this.invoke(androidx.compose.ui.input.key.KeyEvent.m1795boximpl(event))).booleanValue()) {
                    long m1810getKeyZmokQxo = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m547getCEK5gGoQ()) ? true : Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m556getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m563getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m564getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m544getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m565getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m1813isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m1814isShiftPressedZmokQxo(event)) {
                    long m1810getKeyZmokQxo2 = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m551getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m552getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m553getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m550getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m560getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m559getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m558getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m557getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m556getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long m1810getKeyZmokQxo3 = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m551getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m552getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m553getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m550getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m560getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m559getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m558getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m557getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m554getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m546getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m549getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m561getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m548getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m562getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m1813isCtrlPressedZmokQxo(((androidx.compose.ui.input.key.KeyEvent) obj).getNativeKeyEvent()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo533mapZmokQxo(KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m1814isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m1813isCtrlPressedZmokQxo(event)) {
                    long m1810getKeyZmokQxo = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m551getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m552getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m553getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, mappedKeys.m550getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m1813isCtrlPressedZmokQxo(event)) {
                    long m1810getKeyZmokQxo2 = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m551getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m552getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m553getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m550getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m555getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m549getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m546getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo2, mappedKeys2.m545getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m1814isShiftPressedZmokQxo(event)) {
                    long m1810getKeyZmokQxo3 = KeyEvent_androidKt.m1810getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m558getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m1781equalsimpl0(m1810getKeyZmokQxo3, mappedKeys3.m557getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo533mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
