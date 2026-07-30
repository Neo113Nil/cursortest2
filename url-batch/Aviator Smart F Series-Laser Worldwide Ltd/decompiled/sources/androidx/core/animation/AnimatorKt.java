package androidx.core.animation;

import android.animation.Animator;
import f6.l;
import y5.w;

/* loaded from: classes.dex */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, l lVar, l lVar2, l lVar3, l lVar4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = new l() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        if ((i8 & 2) != 0) {
            lVar2 = new l() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        if ((i8 & 4) != 0) {
            lVar3 = new l() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        if ((i8 & 8) != 0) {
            lVar4 = new l() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final l lVar, final l lVar2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                lVar.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = new l() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$1
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        if ((i8 & 2) != 0) {
            lVar2 = new l() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$2
                public final void invoke(Animator animator2) {
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return w.INSTANCE;
                }
            };
        }
        return addPauseListener(animator, lVar, lVar2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final l lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final l lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, l lVar) {
        return addPauseListener$default(animator, null, lVar, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final l lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, l lVar) {
        return addPauseListener$default(animator, lVar, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final l lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                l.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
